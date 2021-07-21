package correct;

import java.time.MonthDay;

/**
 * * La correció està en què abans s'instanciava l'objecte EmailSender, el qual era una implementació concreta.
 * * Ara, la classe EmailSender s'ha transformat en una interface que pot implementar qualsevol classe que sigui una implementació concreta d'enviar mails.
 * * En el meu cas, he creat una classe Gmail que implementa EmailSender i que seria la que envia els mails.
 * * Llavors, en aquesta classe injecto pel constructor la implementació de EmailSender que vulgui i
 * * el codi seguirà funcionant perquè totes les implementacions
 * * cumpleixen el contracte de què tenen els mètodes de la interface, i aquí l'objecte és del tipus de la interface.
 * * Per tant, si demà poso Outlook com a EmailSender, només em caldrà crear una classe que implementi la interface EmailSender i
 * * passar-li al constructor de BirthdayGreeter un objecte que sigui una instància d'aquesta nova classe
 */

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final Clock clock;
    private final EmailSender emailSender;

    public BirthdayGreeter(EmployeeRepository employeeRepository, Clock clock, EmailSender emailSender) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
        this.emailSender = emailSender;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay();
        employeeRepository.findEmployeesBornOn(today)
                .stream()
                .map(employee -> emailFor(employee))
                .forEach(email -> this.emailSender.send(email));
    }

    private Email emailFor(Employee employee) {
        String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy birthday!", message);
    }

}
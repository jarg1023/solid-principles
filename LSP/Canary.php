<?php

class Canary extends Bird {

    public function tweet(): string
    {
        return 'Piupiupiu!';
    }

    public function fly(): string
    {
        return 'Bye bye!';
    }
}
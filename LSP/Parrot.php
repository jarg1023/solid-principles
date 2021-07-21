<?php

// ! This class violates the Liskov Substitution Principle because it changes the default behaviour of these methods

class Parrot extends Bird
{
    public function tweet(): string
    {
        $canSing = false;

        if ($canSing) {
            return "LaLaLa";
        }

        return false;
    }

    public function fly(): string
    {
        $canFly = false;

        if ($canFly) {
            return "Moving";
        }

        return false;
    }
}

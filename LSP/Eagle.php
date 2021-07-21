<?php

class Eagle extends Bird
{
    public function tweet(): string
    {
        return 'AAArh AAArh';
    }

    public function fly(): string
    {
        return "Let's go!";
    }
}

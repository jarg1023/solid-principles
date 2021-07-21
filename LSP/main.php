<?php

require_once './Bird.php';
require_once './Canary.php';
require_once './Eagle.php';
require_once './Parrot.php';

$bird = new Bird();
$canary = new Canary();
$eagle = new Eagle();
$parrot = new Parrot();

echo $bird->tweet();
echo "\n";
echo $canary->tweet();
echo "\n";
echo $eagle->tweet();
echo "\n";
echo $parrot->tweet();
echo "\n";

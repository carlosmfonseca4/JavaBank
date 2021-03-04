package org.academiadecodigo.javabank.mvc;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.application.UserOptions;

public class View {

    Prompt prompt;
    Controller controller;
    MenuInputScanner mainMenu;


    public View(){

        prompt = new Prompt(System.in, System.out);
        mainMenu().start;

    }

    public Prompt getPrompt(){

        return prompt;
    }

}


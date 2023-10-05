/*
* File: MainController.java
* Author: Paulusz Zsombor
* Copyright: 2023, Paulusz Zsombor
* Group: Szoft II/N
* Date: 2023-10-05
* Github: https://github.com/PZsombor/
* Licenc: GNU GPL
*/

package controllers;

import models.Filereader;


public class MainController {
    public MainController() {
        new Filereader().LoadData();
    }
}

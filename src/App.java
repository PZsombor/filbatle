/*
* File: App.java
* Author: Paulusz Zsombor
* Copyright: 2023, Paulusz Zsombor
* Group: Szoft II/N
* Date: 2023-10-05
* Github: https://github.com/PZsombor/
* Licenc: GNU GPL
*/

import controllers.MainConsole;
import controllers.MainController;

public class App {
    public static void main(String[] args) throws Exception {
        new MainController();
        new MainConsole();
    }
}

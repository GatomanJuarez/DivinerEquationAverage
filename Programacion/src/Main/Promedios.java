package Main;

import javax.swing.JOptionPane;

public class Promedios {

    public static void main(String[] args) {
        byte salida;
        int[] calificaciones = new int[5];
        int promediog = 0, alumno;
        int promedios[] = new int[6];
        do {

            alumno = Integer.parseInt(JOptionPane.showInputDialog("\nQue alumno eres:"
                    + "\n1.Pepe"
                    + "\n2.Paco"
                    + "\n3.Osvaldo"
                    + "\n4.Edna"
                    + "\n5.Ana"
                    + "\n6.Antonio"
                    + "\n7.promedio grupal"));

            switch (alumno) {
                case 1:
                    calificaciones[0] = 0;
                    calificaciones[1] = 0;
                    calificaciones[2] = 0;
                    calificaciones[3] = 0;
                    calificaciones[4] = 0;
                    promedios[0] = 0;
                    calificaciones[0] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de matematicas( (100,max)"));
                    calificaciones[1] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de español"));
                    calificaciones[2] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de ingles"));
                    calificaciones[3] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de electricidad y magnetismo"));
                    calificaciones[4] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de valores del ser"));
                    promedios[0] = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) / 5;
                    if (promedios[0] >= 70) {
                        System.out.print("\nPasaste");
                    } else {
                        System.out.print("\nNo aprovado");
                    }
                    break;
                case 2:
                    calificaciones[0] = 0;
                    calificaciones[1] = 0;
                    calificaciones[2] = 0;
                    calificaciones[3] = 0;
                    calificaciones[4] = 0;
                    promedios[1] = 0;
                    calificaciones[0] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de matematicas( (100,max)"));
                    calificaciones[1] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de español"));
                    calificaciones[2] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de ingles"));
                    calificaciones[3] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de electricidad y magnetismo"));
                    calificaciones[4] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de valores del ser"));
                    promedios[1] = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) / 5;
                    if (promedios[1] >= 70) {
                        System.out.print("\nPasaste");
                    } else {
                        System.out.print("\nNo aprovado");
                    }
                    break;

                case 3:
                    calificaciones[0] = 0;
                    calificaciones[1] = 0;
                    calificaciones[2] = 0;
                    calificaciones[3] = 0;
                    calificaciones[4] = 0;
                    promedios[2] = 0;
                    calificaciones[0] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de matematicas( (100,max)"));
                    calificaciones[1] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de español"));
                    calificaciones[2] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de ingles"));
                    calificaciones[3] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de electricidad y magnetismo"));
                    calificaciones[4] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de valores del ser"));
                    promedios[2] = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) / 5;
                    if (promedios[2] >= 70) {
                        System.out.print("\nPasaste");
                    } else {
                        System.out.print("\nNo aprovado");
                    }
                    break;

                case 4:
                    calificaciones[0] = 0;
                    calificaciones[1] = 0;
                    calificaciones[2] = 0;
                    calificaciones[3] = 0;
                    calificaciones[4] = 0;
                    promedios[3] = 0;
                    calificaciones[0] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de matematicas( (100,max)"));
                    calificaciones[1] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de español"));
                    calificaciones[2] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de ingles"));
                    calificaciones[3] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de electricidad y magnetismo"));
                    calificaciones[4] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de valores del ser"));
                    promedios[3] = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) / 5;
                    if (promedios[3] >= 70) {
                        System.out.print("\nPasaste");
                    } else {
                        System.out.print("\nNo aprovado");
                    }
                    break;

                case 5:
                    calificaciones[0] = 0;
                    calificaciones[1] = 0;
                    calificaciones[2] = 0;
                    calificaciones[3] = 0;
                    calificaciones[4] = 0;
                    promedios[4] = 0;
                    calificaciones[1] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de matematicas( (100,max)"));
                    calificaciones[2] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de español"));
                    calificaciones[3] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de ingles"));
                    calificaciones[4] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de electricidad y magnetismo"));
                    calificaciones[5] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de valores del ser"));
                    promedios[4] = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) / 5;
                    if (promedios[4] >= 70) {
                        System.out.print("\nPasaste");
                    } else {
                        System.out.print("\nNo aprovado");
                    }
                    break;

                case 6:
                    calificaciones[0] = 0;
                    calificaciones[1] = 0;
                    calificaciones[2] = 0;
                    calificaciones[3] = 0;
                    calificaciones[4] = 0;
                    promedios[5] = 0;
                    calificaciones[0] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de matematicas( (100,max)"));
                    calificaciones[2] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de español"));
                    calificaciones[3] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de ingles"));
                    calificaciones[4] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de electricidad y magnetismo"));
                    calificaciones[5] = Integer.parseInt(JOptionPane.showInputDialog("Dame tu calificacion de valores del ser"));
                    promedios[5] = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) / 5;
                    if (promedios[5] >= 70) {
                        System.out.print("\nPasaste");
                    } else {
                        System.out.print("\nNo aprovado");
                    }
                    break;
                case 7:
                    promediog = (promedios[0] + promedios[1] + promedios[2] + promedios[3] + promedios[4] + promedios[5]) / 6;
                    System.out.print("\nEl promedio grupal es:  " + promediog);

                default:
                    System.out.print("\nNo joven");
                    break;
            }
            salida = Byte.parseByte(JOptionPane.showInputDialog("0 para salir"));
        } while (salida != 0);
    }
}

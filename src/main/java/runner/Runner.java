package runner;

import entities.Contratado;
import entities.Empleado;
import entities.Regular;
import manager.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Runner {

    public static void main(String[] args){

        Session sesion = SessionManager.getSession();

        Transaction t = sesion.beginTransaction();

        Empleado e = new Empleado("Carlos");
        System.out.println(e.toString());

        Regular r = new Regular("Juan",5000f,500);
        System.out.println(r.toString());

        Contratado c = new Contratado("Maria",200,"2 años");
        System.out.println(c.toString());

        sesion.persist(e);
        sesion.persist(r);
        sesion.persist(c);

        t.commit();

        System.out.println("Finalizado con éxito");

    }

}

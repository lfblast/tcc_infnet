package br.edu.infnet.engjava.projetotcc.aplicacao;

import br.edu.infnet.engjava.projetotcc.modelo.*;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Principal {

    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;

        try {
            sessionFactory = buildSessionFactory();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }
    
    private static SessionFactory buildSessionFactory() throws ExceptionInInitializerError {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            Properties properties = new Properties();
            properties.setProperty("hibernate.hbm2ddl.auto", "create");
            configuration.addProperties(properties);
            
            configuration.addAnnotatedClass(Administrador.class);
            configuration.addAnnotatedClass(Aluno.class);
            configuration.addAnnotatedClass(Avaliacao.class);
            configuration.addAnnotatedClass(Bloco.class);
            configuration.addAnnotatedClass(Credencial.class);
            configuration.addAnnotatedClass(Curso.class);
            configuration.addAnnotatedClass(EmailAbertura.class);
            configuration.addAnnotatedClass(Modulo.class);
            configuration.addAnnotatedClass(Questao.class);
            configuration.addAnnotatedClass(Questionario.class);
            configuration.addAnnotatedClass(Turma.class);
            configuration.addAnnotatedClass(Usuario.class);
            
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            return sessionFactory;
        }
        catch (Throwable ex) {
            System.err.println("Falha na criação da SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
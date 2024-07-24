package spring_framework.c01gettingstarted;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.c02createjavaobjects.GamingConfiguration;
import spring_framework.c01gettingstarted.game.GameRunner;
import spring_framework.c01gettingstarted.game.GamingConsole;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }
    }
}


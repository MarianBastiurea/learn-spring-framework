package com.marianbastiurea.spring_framework.c01gettingstarted;

import com.marianbastiurea.spring_framework.c01gettingstarted.game.GameRunner;
import com.marianbastiurea.spring_framework.c01gettingstarted.game.GamingConsole;
import com.marianbastiurea.spring_framework.c02createjavaobjects.GamingConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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


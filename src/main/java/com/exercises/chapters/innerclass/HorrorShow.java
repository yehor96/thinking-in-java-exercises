package com.exercises.chapters.innerclass;

interface Monster {
    void menace();
}
interface DangerousMonster extends Monster {
    void destroy();
}
interface Lethal {
    void kill();
}
class DragonZilla {
    public DangerousMonster getDMonser(){
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("Ha!");
            }

            @Override
            public void menace() {
                System.out.println("Ha!");
            }
        };
    }
}
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}
class VeryBadVampire {
    public Vampire getVampire() {
        return new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };
    }
}
public class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla().getDMonser();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire().getVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}

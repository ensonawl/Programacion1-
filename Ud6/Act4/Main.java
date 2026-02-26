static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
static Set<CuerpoCeleste> planetas = new HashSet<>();
void main() {
    CuerpoCeleste Mercurio = new CuerpoCeleste("Mercurio", 88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste Venus = new CuerpoCeleste("Venus", 225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste Tierra = new CuerpoCeleste("Tierra", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste Marte = new CuerpoCeleste("Marte", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste Jupiter = new CuerpoCeleste("Jupiter", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste Saturno = new CuerpoCeleste("Saturno", 10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste Urano = new CuerpoCeleste("Urano", 30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste Neptuno = new CuerpoCeleste("Neptuno", 165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste Pluton = new CuerpoCeleste("Pluton", 248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);

    sistemaSolar.put("Mercurio", Mercurio);
    sistemaSolar.put("Venus", Venus);
    sistemaSolar.put("Tierra", Tierra);
    sistemaSolar.put("Marte", Marte);
    sistemaSolar.put("Jupiter", Jupiter);
    sistemaSolar.put("Saturno", Saturno);
    sistemaSolar.put("Urano", Urano);
    sistemaSolar.put("Neptuno", Neptuno);
    sistemaSolar.put("Pluton", Pluton);

    planetas.add(Mercurio);
    planetas.add(Venus);
    planetas.add(Tierra);
    planetas.add(Marte);
    planetas.add(Jupiter);
    planetas.add(Saturno);
    planetas.add(Urano);
    planetas.add(Neptuno);
    planetas.add(Pluton);

    CuerpoCeleste Luna = new CuerpoCeleste("Luna", 27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
    sistemaSolar.put("Luna", Luna);
    System.out.println(Tierra.addSatelite(Luna));

    CuerpoCeleste Deimos = new CuerpoCeleste("Deimos", 1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
    CuerpoCeleste Phobos = new CuerpoCeleste("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
    sistemaSolar.put("Deimos", Deimos);
    sistemaSolar.put("Phobos", Phobos);
    System.out.println(Marte.addSatelite(Deimos));
    System.out.println(Marte.addSatelite(Phobos));

    CuerpoCeleste Io = new CuerpoCeleste("Io", 1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
    CuerpoCeleste Europa = new CuerpoCeleste("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
    CuerpoCeleste Ganymede = new CuerpoCeleste("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
    CuerpoCeleste Callisto = new CuerpoCeleste("Callisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
    sistemaSolar.put("Io", Io);
    sistemaSolar.put("Europa", Europa);
    sistemaSolar.put("Ganymede", Ganymede);
    sistemaSolar.put("Callisto", Callisto);
    System.out.println(Jupiter.addSatelite(Io));
    System.out.println(Jupiter.addSatelite(Europa));
    System.out.println(Jupiter.addSatelite(Ganymede));
    System.out.println(Jupiter.addSatelite(Callisto));

    for (CuerpoCeleste planeta : planetas) {
        System.out.println(planeta.toString());
    }

    System.out.println(sistemaSolar.get("Marte").getSatelites());

    Set<CuerpoCeleste> lunas = new HashSet<>();
    lunas.add(Luna);
    lunas.add(Deimos);
    lunas.add(Phobos);
    lunas.add(Io);
    lunas.add(Europa);
    lunas.add(Ganymede);
    lunas.add(Callisto);

    for (CuerpoCeleste luna : lunas) {
        System.out.println(luna.toString());
    }

    System.out.println(Tierra.getSatelites());
    System.out.println(Marte.getSatelites());
    System.out.println(Jupiter.getSatelites());

    System.out.println(lunas);

    CuerpoCeleste pluton = new CuerpoCeleste("Plutón", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);

    for (CuerpoCeleste planeta : planetas) {
        System.out.println(planeta.toString());
    }

    CuerpoCeleste plutonEnano = new CuerpoCeleste("Plutón", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
    
    for (CuerpoCeleste planeta : planetas) {
        System.out.println(planeta.toString());
    }
}

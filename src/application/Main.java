    package application;

    import entities.Comentario;
    import entities.Post;

    import java.text.ParseException;
    import java.text.SimpleDateFormat;

    public class Main {

        public static void main(String[] args) throws ParseException {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Comentario c1 = new Comentario("Tenha uma boa viagem!");
            Comentario c2 = new Comentario("Nossa que incrivel!");
            Post p1 = new Post(
                    sdf.parse("29/06/2022 18:24:45"),
                    "Viajando para o Maranhão",
                    "Eu vou visitar esse estado maravilhoso!",
                    12);
            p1.addComentario(c1);
            p1.addComentario(c2);

            System.out.println(p1);

            Comentario c3 = new Comentario("Boa noite!");
            Comentario c4 = new Comentario("Fique sempre bem!");
            Post p2 = new Post(
                    sdf.parse("29/06/2022 18:25:48"),
                    "Boa noite galera! ",
                    "Vejo voces amanha",
                    19);

            p2.addComentario(c3);
            p2.addComentario(c4);

            System.out.println(p2);


        }
    }
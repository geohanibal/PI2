package viederholungen;
import java.util.*;
import java.util.HashMap;
import java.util.List;

public class GraphenAlgorithmen {
    static Map<Character, List<Character>> graph = new HashMap<>();

    /**
     * knotebis amatebs, titoeul knotze warmoqmnis masivs
     * @param knoten
     */
    static void hinzufuegKnoten(Character knoten){
        graph.put(knoten,new ArrayList<>());
    }

    /**
     * es verbindet miteinander
     * @param knote1 die erste eingabe
     * @param knote2 zweite eingabe von knoteb
     */
    static void verbinde(Character knote1, Character knote2){
        graph.get(knote1).add(knote2);
        graph.get(knote2).add(knote2);
    }

    public static void main(String[] args) {
        hinzufuegKnoten('A');
        hinzufuegKnoten('B');
        hinzufuegKnoten('C');
        hinzufuegKnoten('D');
        hinzufuegKnoten('E');
        hinzufuegKnoten('F');
        hinzufuegKnoten('G');

        verbinde('A','B');
        verbinde('A','C');
        verbinde('B','E');
        verbinde('C','E');
        verbinde('C','D');
        verbinde('E','G');
        verbinde('D','G');

        bfs('A');
        System.out.println(" ");
        dfs('A');

    }

    //BFS
    static void bfs(Character startKnoten){
        Set<Character> besucht = new HashSet<>();
        Queue<Character> warteshlange = new LinkedList<>();
        List<Character> alleKnot = new ArrayList<>();

        warteshlange.add(startKnoten);
        besucht.add(startKnoten);

        while (!warteshlange.isEmpty()){
            Character naechsterKnoten = warteshlange.poll();
            alleKnot.add(naechsterKnoten);

            for (Character nachbar : graph.get(naechsterKnoten)){
                if(!besucht.contains(nachbar)){
                    warteshlange.add(nachbar);
                    besucht.add(nachbar);
                }
            }
        }

        for (Character knoten : alleKnot){
            System.out.print(knoten + " ");
        }
    }

    //DFS
    static void dfs(Character startKnoten) {
        Set<Character> besucht = new HashSet<>();
        Stack<Character> stapel = new Stack<>();
        List<Character> alleKnot = new ArrayList<>();

        stapel.add(startKnoten);
        besucht.add(startKnoten);

        while (!stapel.isEmpty()){
            Character naechsterKnoten = stapel.pop();
            alleKnot.add(naechsterKnoten);

            for (Character nachbar : graph.get(naechsterKnoten)){
                if(!besucht.contains(nachbar)){
                    stapel.add(nachbar);
                    besucht.add(nachbar);
                }
            }
        }
        for ( Character knoten : alleKnot){
            System.out.print(knoten + " ");
        }
    }
    }

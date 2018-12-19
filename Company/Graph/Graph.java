package Company.Graph;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Graph {
    private class Edge {
        Vertex one;
        Vertex two;

        public Edge(Vertex one, Vertex two) {
            this.one = one;
            this.two = two;
        }
    }

    private class Vertex {
        String name;
        HashMap<Vertex, Edge> nbrs;

        public Vertex(String name) {
            this.name = name;
            this.nbrs = new HashMap<>();
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public boolean equals(Object other) {
            Vertex o = (Vertex) other;
            return this.name.equals(o.name);
        }

        public boolean isAdjacent(Vertex other) {
            return this.nbrs.containsKey(other);
        }

    }

    private HashMap<String, Vertex> vertices;

    public Graph() {
        this.vertices = new HashMap<>();

    }

    public void display() {
        Collection<Vertex> vertices = this.vertices.values();
        for (Vertex vtx : vertices) {
            System.out.print(vtx.name + " => ");
            Set<Vertex> nbrsOfVtx = vtx.nbrs.keySet();
            for (Vertex nbr : nbrsOfVtx) {
                System.out.print(nbr.name + " ,");
            }
            System.out.println("END");
        }

    }

    public void addVertex(String v) throws Exception {
        if (this.vertices.containsKey(v)) {
            throw new Exception("Vertex already contain");
        }
        Vertex vtx = new Vertex(v);
        this.vertices.put(v, vtx);
    }

    public int numVertices() {
        return this.vertices.size();
    }

    public void removeVertex(String v) throws Exception {
        if (!this.vertices.containsKey(v)) {
            throw new Exception("Vertex not contain");
        }
        Vertex tobeRemoved = this.vertices.get(v);
        Set<Vertex> nbrs = tobeRemoved.nbrs.keySet();
        for (Vertex nbr : nbrs) {
            nbr.nbrs.remove(tobeRemoved);
        }
        this.vertices.remove(v);
    }

    public int numEdges() {
        int rv = 0;
        Collection<Vertex> vertices = this.vertices.values();
        for (Vertex vtx : vertices) {
            rv += vtx.nbrs.size();
        }
        return rv / 2;
    }

}

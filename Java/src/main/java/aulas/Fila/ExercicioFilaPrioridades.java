public class ExercicioFilaPrioridades {

    // Definição da classe Request para representar uma solicitação
    static class Request {
        String priority; 
        String data; //dado

        public Request(String priority, String data) {
            this.priority = priority;
            this.data = data;
        }
    }

    // Definição da classe Node (Nó) para os elementos da fila encadeada
    static class Node {
        Request request;
        Node next; //(Nó -> Node.next para que o ponteiro aponte para o proximo valor da lista)

        public Node(Request request) {
            this.request = request;
            this.next = null;
        }
    }

    // Definição da classe TQueue para a implementação da fila de solicitações
    static class TQueue {
        Node front; //frente ou primeiro
        Node rear; //tras ou ultimo
        int count;

        public TQueue() {  // inicializa com valores null
            front = null;
            rear = null;
            count = 0;
        }

        // Método para enfileirar uma solicitação com base na prioridade
        public void enqueue(String priority, String data) {
            Request req = new Request(priority, data); // criando nova request
            Node newNode = new Node(req); //criando novo nó

            if (front == null) { //se o primeiro for igual a null, significa que a lista esta vazia
                front = newNode;
                rear = newNode;
            } else { // se nao for, o atual pega o valor do primeiro para percorrer a fila
                Node current = front;
                Node previous = null;

                while (current != null && comparePriority(current.request.priority, priority) <= 0) {
                    previous = current;
                    current = current.next;
                }

                if (previous == null) {
                    newNode.next = front;
                    front = newNode;
                } else if (current == null) {
                    rear.next = newNode;
                    rear = newNode;
                } else {
                    previous.next = newNode;
                    newNode.next = current;
                }
            }
            count++;
        }

        // Método para desenfileirar a próxima solicitação com maior prioridade
        public Request dequeue() {
            if (front == null) {
                System.out.println("A fila está vazia.");
                return null;
            } else {
                Request req = front.request;
                Node temp = front;
                front = front.next;
                temp = null; // Liberando a referência para o nó removido
                count--;
                return req;
            }
        }

        // Método para retornar o número de solicitações na fila
        public int size() {
            return count;
        }

        // Método auxiliar para comparar prioridades
        private int comparePriority(String p1, String p2) {
            List<String> priorities = Arrays.asList("alta", "media", "baixa");
            return priorities.indexOf(p1) - priorities.indexOf(p2);
        }
    }

    // Método main para teste da implementação da fila de solicitações
    public static void main(String[] args) {
        TQueue queue = new TQueue();

        // Enfileirando algumas solicitações de exemplo com diferentes prioridades
        queue.enqueue("alta", "Solicitação 1");
        queue.enqueue("media", "Solicitação 2");
        queue.enqueue("baixa", "Solicitação 3");
        queue.enqueue("alta", "Solicitação 4");
        queue.enqueue("media", "Solicitação 5");
        queue.enqueue("baixa", "Solicitação 6");

        System.out.println("Número de solicitações na fila: " + queue.size());

        // Desenfileirando e exibindo as solicitações na ordem de prioridade
        Request req = queue.dequeue();
        if (req != null) {
            System.out.println("Removida solicitação com prioridade " + req.priority + " e dados: " + req.data);
        }

        req = queue.dequeue();
        if (req != null) {
            System.out.println("Removida solicitação com prioridade " + req.priority + " e dados: " + req.data);
        }

        // Continuar desenfileirando até a fila estar vazia
        while (queue.size() > 0) {
            req = queue.dequeue();
            if (req != null) {
                System.out.println("Removida solicitação com prioridade " + req.priority + " e dados: " + req.data);
            }
        }
    }
}
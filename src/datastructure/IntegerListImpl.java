package datastructure;

public class IntegerListImpl implements IntegerList {
    private Node currentElement;

    @Override
    public Integer getNext() {
        Node next = currentElement.getNext();
        currentElement = next;
        if (next != null) {
            return next.getValue();
        }
        return null;
    }

    @Override
    public Integer getPrevious() {
        Node previous = currentElement.getPrevious();
        currentElement = previous;
        if (previous != null) {
            return previous.getValue();
        }
        return null;
    }

    @Override
    public Integer getCurrent() {
        if (currentElement != null) {
            return currentElement.getValue();
        }
        return null;
    }

    @Override
    public void add(Integer integer) {
        if (currentElement == null) {
            currentElement = new Node();
            currentElement.setValue(integer);
        } else {
            Node nextNode = new Node();
            nextNode.setValue(integer);
            currentElement.setNext(nextNode);
            nextNode.setPrevious(currentElement);
            currentElement = nextNode;
        }
    }

    @Override
    public void remove() {
        if (currentElement != null) {
            Node previous = currentElement.getPrevious();
            Node next = currentElement.getNext();
            if (previous == null) {
                if (next != null) {
                    currentElement = next;
                    next.setPrevious(null);
                } else {
                    currentElement = null;
                }
            } else {
                if (next != null) {
                    currentElement = next;
                    next.setPrevious(previous);
                } else {
                    currentElement = previous;
                    currentElement.setNext(null);
                }
            }
        }
    }
}

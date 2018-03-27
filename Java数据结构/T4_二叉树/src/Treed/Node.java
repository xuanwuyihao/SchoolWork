package Treed;

public class Node {

	private person person; 
	private Node leftChold;
	private Node rightChold;
	
	public Node(person person){
		this.person=person;
		leftChold=null;
		rightChold=null;
	}

	public person getPerson() {
		return person;
	}

	public void setPerson(person person) {
		this.person = person;
	}

	public Node getLeftChold() {
		return leftChold;
	}

	public void setLeftChold(Node leftChold) {
		this.leftChold = leftChold;
	}

	public Node getRightChold() {
		return rightChold;
	}

	public void setRightChold(Node rightChold) {
		this.rightChold = rightChold;
	}
	
	
}

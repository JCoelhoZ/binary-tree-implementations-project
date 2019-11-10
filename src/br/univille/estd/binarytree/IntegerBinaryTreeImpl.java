package br.univille.estd.binarytree;

public class IntegerBinaryTreeImpl implements IntegerBinaryTree {

	private LinkedBinaryTree<Integer> innerTree;

	private boolean found;

	public IntegerBinaryTreeImpl() {
		innerTree = new LinkedBinaryTree<>();
	}
	@Override
	public void add(Integer i) {
		if (isEmpty())
			innerTree.addRoot(i)
		else
			insertElement(innerTree.root(), i);
	}
	@Override
	public boolean contains(Integer i) {
		found = false;
		containsElement(innerTree.root(), i);
		boolean beenFound = found;
		found = false;
		return beenFound;
	}

	public void remove(Integer i) {
		removeElement(innerTree.root(), i)

	}

	public boolean isEmpty() {
		return innerTree.size() == 0;
	}

	public int size() {
		return innerTree.size();
	}

	public void clear() {
		innerTree = new LinkedBinaryTree<>();
	}

	private void removeElement(BTPosition<Integer> position, Integer i) {
		Integer number = position.getElement();

		if (number.equals(i))
			innerTree.remove(position);

		if (position.getRight() != null)
			removeElement(position.getRight(), i);

		if (position.getLeft() != null)
			removeElement(position.getLeft(), i);
	}

	private void containsElement(BTPosition<Integer> position, Integer i) {
		Integer number = position.getElement();

		if (number.equals(i))
			found = true;

		if (position.getRight() != null)
			containsElement(position.getRight(), i);

		if (position.getLeft() != null)
			containsElement(position.getLeft(), i);
	}

	private void insertElement(BTPosition<Integer> position, Integer i) {
		Integer element = position.getElement();

		if (i < element)

			if (position.getLeft() != null)
				insertElement(position.getLeft(), i);
			else
				innerTree.insertLeft(position, i);

		else if (i > element)
			if (position.getRight() != null)
				insertElement(position.getRight(), i);
			else
				innerTree.insertRight(position, i);

		else
			throw new IllegalArgumentException("A arvore já possui o valor " + i);
	}
}
package br.univille.estd.binarytree;

/**
 * Implementacao de uma árvore binária usando estrutura encadeada
 * @author leandersonandre
 *
 * @param <E>
 */
public class LinkedBinaryTree<E> {

	protected BTPosition<E> root; // Referencia para a raiz
	protected int size;           // Numero de nodos

	/**
	 * Construtor de uma árvore vazia
	 */
	public LinkedBinaryTree() {
		root = null; // inicia com uma árvore vazia
		size = 0;
	}

	/**
	 * Retorna o numero de nodos da árvore
	 * @return
	 */
	public int size() {
		return -1;
	}

	/**
	 * Retorna se um nodo é interno
	 */
	public boolean isInternal(BTPosition<E> v) throws InvalidPositionException{
		return false;
	}


	/**
	 * Retorna se um nodo é externo
	 */
	public boolean isExternal(BTPosition<E> v) throws InvalidPositionException{
		return false;
	}

	/**
	 * Retorna se um nodo é a raiz
	 */
	public boolean isRoot(BTPosition<E> v) throws InvalidPositionException{
		return false;
	}
	/**
	 * Retorna se um nodo tem o filho da esquerda
	 */
	public boolean hasLeft(BTPosition<E> v) throws InvalidPositionException{
		if (v == null) {
			throw new InvalidPositionException(InvalidPositionException.POSITION_CANNOT_BE_NULL);
		}
		return v.getLeft() != null;
	}

	/**
	 * Retorna se um nodo tem o filho da direita
	 */
	public boolean hasRight(BTPosition<E> v) throws InvalidPositionException{
		if (v == null) {
			throw new InvalidPositionException(InvalidPositionException.POSITION_CANNOT_BE_NULL);
		}
		return v.getRight() != null;
	}

	/**
	 * Retorna a raiz da arvore
	 */
	public BTPosition<E> root() throws EmptyTreeException{
		if (root == null) {
			throw new EmptyTreeException("Arvore vazia");
		}
		return root;
	}

	/**
	 * Retorna o filho da esquerda de um nodo
	 * Lanca BoundaryViolationException se nao tiver filho da esquerda
	 */
	public BTPosition<E> left(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if (v.getLeft() == null) {
			throw new BoundaryViolationException("There's no left child");
		}
		return v.getLeft();
	}

	/**
	 * Retorna o filho da direita de um nodo
	 * Lanca BoundaryViolationException se nao tiver filho da direita
	 */
	public BTPosition<E> right(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if (v.getRight() == null) {
			throw new BoundaryViolationException("There's no right child");
		}
		return v.getRight();
	}

	/**
	 * Retorna o pai de um nodo
	 * Lanca BoundaryViolationException se nao tiver pai
	 */
	public BTPosition<E> parent(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if (v == root) {
			throw new BoundaryViolationException("It's an orphan root");
		}
		return v.getParent();
	}

	/**
	 * Substitui o elemento armazenado no nodo
	 * Retorna o elemento substituido
	 */
	public E replace(BTPosition<E> v, E o) throws InvalidPositionException{
		E replaced = v.getElement();
		v.setElement(o);
		return replaced;
	}

	/**
	 * Retorna o irmao de um nodo
	 * Lanca BoundaryViolationException se nao tiver um irmao
	 */
	public BTPosition<E> sibling(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if (v == null)
			throw new InvalidPositionException(InvalidPositionException.POSITION_CANNOT_BE_NULL);

		if (v.getParent() == null)
			throw new BoundaryViolationException("");

		BTPosition<E> left = new v.getParent().getLeft();
		BTPosition<E> right = new v.getParent().getLeft();

		if (left == null || right == null)
			throw new BoundaryViolationException("");

		if (!left.equals(v))
			return v.getParent().getLeft();

		return right;
	}

	/**
	 * Insere a raiz em uma arvore vazia
	 */
	public BTPosition<E> addRoot(E e) throws NonEmptyTreeException{
		if (root != null)
			throw new NonEmptyTreeException("Tree isn't empty");
		size++;
		return root = new BTPosition<>(e);
	}

	/**
	 * Insere o filho da esquerda em um nodo
	 */
	public BTPosition<E> insertLeft(BTPosition<E> v, E e) throws InvalidPositionException{
		if (v == null)
			throw new InvalidPositionException(InvalidPositionException.POSITION_CANNOT_BE_NULL);
		BTPosition<E> position = new BTPosition<>(e);
		v.setLeft(position);
		return position;
	}

	/**
	 * Insere o filho da direita em um nodo
	 */
	public BTPosition<E> insertRight(BTPosition<E> v, E e) throws InvalidPositionException{
		if (v == null)
			throw new InvalidPositionException(InvalidPositionException.POSITION_CANNOT_BE_NULL);
		BTPosition<E> position = new BTPosition<>(e);
		v.setRight(position);
		return position;
	}

	/**
	 * Remove um nodo com zero ou um filho
	 * Nao pode remover um nodo com dois filhos. Deve lancar InvalidPositionException
	 */
	public E remove(BTPosition<E> v) throws InvalidPositionException{
		if (v.hasBothChilds())
			throw new InvalidPositionException(InvalidPositionException.POSITION_HAS_CHILDREN);
		if (v == null)
			throw new InvalidPositionException(InvlidPositionException.POSITION_CANNOT_BE_NULL);
		if (v.getParent() != null){
			if (v.e	)
		}
		return null;
	}

	/**
	 *  Cria um novo nodo para a arvore binaria
	 */
	protected BTPosition<E> createNode(E element, BTPosition<E> parent, BTPosition<E> left, BTPosition<E> right) {
		return null;
	}

}

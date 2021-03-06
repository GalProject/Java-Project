package view;

import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;
import algorithms.search.Solution;
import algorithms.search.State;


// this is (1) the common type, and (2) a type of widget
// (1) we can switch among different MazeDisplayers
// (2) other programmers can use it naturally
public abstract class MazeDisplayer extends Canvas {
	
	// just as a stub...
	Maze3d maze;
	int [][][] mazeData;
	Solution solution;
	
//	={
//			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
//			{1,0,0,0,0,0,0,0,1,1,0,1,0,0,1},
//			{0,0,1,1,1,1,1,0,0,1,0,1,0,1,1},
//			{1,1,1,0,0,0,1,0,1,1,0,1,0,0,1},
//			{1,0,1,0,1,1,1,0,0,0,0,1,1,0,1},
//			{1,1,0,0,0,1,0,0,1,1,1,1,0,0,1},
//			{1,0,0,1,0,0,1,0,0,0,0,1,0,1,1},
//			{1,0,1,1,0,1,1,0,1,1,0,0,0,1,1},
//			{1,0,0,0,0,0,0,0,0,1,0,1,0,0,1},
//			{1,1,1,1,1,1,1,1,1,1,1,1,0,1,1},
//		};

	

	public MazeDisplayer(Composite parent, int style) {
		super(parent, style);
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
		
		
	}
	public void removeSol() {
		try{
		if(solution.getArr().size()>0){
			while(!solution.getArr().isEmpty()){
				solution.getArr().remove(0);
			}
		}}
		catch (Exception e) {
		}
	}
	public void setMaze(Maze3d maze1){
		maze = maze1;
		mazeData = maze.getMatrix();
	}
	
	
	public int[][][] getMazeData() {
		return maze.getMatrix();
	}

		
	public abstract void setCharacterPosition(State<Position> p);

	public abstract void moveUp();

	public abstract  void moveDown();

	public abstract  void moveLeft();

	public  abstract void moveRight();
	
	public abstract void printSolution();

	public abstract void moveForword();

	public abstract void moveBackward();

	public abstract void walkToSolution();


	
	
	

}
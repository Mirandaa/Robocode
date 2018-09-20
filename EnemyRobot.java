package training.adv.robocode.impl.wangxinrou;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class EnemyRobot {
	private double x,y;
	private String name = null ; 
	private double headingRadian = 0.0D;
	private double bearingRadian = 0.0D;
	private double distance = 1000D;
	private double direction = 0.0D;
	private double velocity = 0.0D;
	private double energy = 100.0D;
	private double previousEnergy = 100.0D;

	private long time;
	private long fireTime;
	
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public long getFireTime() {
		return fireTime;
	}
	public void setFireTime(long fireTime) {
		this.fireTime = fireTime;
	}
	public double getPreviousEnergy() {
		return previousEnergy;
	}
	public void setPreviousEnergy(double previousEnergy) {
		this.previousEnergy = previousEnergy;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeadingRadian() {
		return headingRadian;
	}
	public void setHeadingRadian(double headingRadian) {
		this.headingRadian = headingRadian;
	}
	public double getBearingRadian() {
		return bearingRadian;
	}
	public void setBearingRadian(double bearingRadian) {
		this.bearingRadian = bearingRadian;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getDirection() {
		return direction;
	}
	public void setDirection(double direction) {
		this.direction = direction;
	}
	public double getVelocity() {
		return velocity;
	}
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	public void init() {

		name = null ; 
		headingRadian = 0.0D;
		bearingRadian = 0.0D;
		distance = 1000D;
		direction = 0.0D;
		velocity = 0.0D;
		energy = 100.0D;
	}
	
	public void update(ScannedRobotEvent e,AdvancedRobot me) {
		name  = e.getName();
		headingRadian = e.getHeadingRadians();
		bearingRadian = e.getBearingRadians();
		this.energy = e.getEnergy();
		this.velocity = e.getVelocity();
		this.distance = e.getDistance();
		direction = bearingRadian + me.getHeadingRadians();
		x = me.getX() + Math.sin(direction) * distance;
		y = me.getY() + Math.cos(direction) * distance;
	}
}
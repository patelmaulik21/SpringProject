package server;

public class CalcServerImpl implements CalcServerIntr 
{
/* (non-Javadoc)
 * @see server.CalcServerIntr#add(int, int)
 */
public int add(int a,int b)
{
	return a+b;
}
/* (non-Javadoc)
 * @see server.CalcServerIntr#sub(int, int)
 */
public int sub(int a,int b)
{
	return a-b;
}

/* (non-Javadoc)
 * @see server.CalcServerIntr#mul(int, int)
 */
public int mul(int a,int b)
{
	return a*b;
}
/* (non-Javadoc)
 * @see server.CalcServerIntr#div(int, int)
 */
public int div(int a,int b)
{
	return a/b;
}

}

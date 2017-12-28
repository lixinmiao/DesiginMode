package 门面模式;

public class ModuleFacade {
	ModuleA a=new ModuleA();
	ModuleB b=new ModuleB();
	public void a()
	{
		a.a();
	}
	public void b()
	{
		b.b();
	}
}

package day0409;

public class SubClass extends Parent{

	public static String s_StaticField = "����--��̬����";
	    /* ���� */
	public String s_Field = "����--����";
	   /* ��̬��ʼ���� */
	static {
	   System.out.println( s_StaticField );
	   System.out.println( "����--��̬��ʼ����" );
	}
	  /* ��ʼ���� */
	{
	   System.out.println( s_Field );
	   System.out.println( "����--��ʼ����" );
	}
	  /* ������ */
	public SubClass()
	{
	   System.out.println( "����--������" );
	   System.out.println( "i=" + i + ",j=" + j );
	}
	
	   /* ������� */
	public static void main( String[] args )
	{
	   System.out.println( "����main����" );
	   new SubClass();
	}

}

class Parent{
	public static String p_staticField = "����--��̬����";
	public  String p_Field = "����--����";
	protected int i=9;
	protected int j =0;
	static {
        System.out.println(p_staticField);
        System.out.println( "����--��̬��ʼ����" );
    }
        /* ��ʼ���� */
    {
        System.out.println( p_Field );
        System.out.println( "����--��ʼ����" );
    }
        /* ������ */
    public Parent()
    {
        System.out.println( "����--������" );
        System.out.println( "i=" + i + ", j=" + j );
        j = 20;
    }
	
}
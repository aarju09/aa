class Rubina
{
	private int age;
	private String qualification;
	private String company;
	Rubina(int age,String qualification,String company)
	{
     System.out.println("AGE is :   "+age);
     System.out.println("QUALIFICATION is  :"+qualification);
     System.out.println("COMPANY is : "+company);
    }
    public static void main(String[] args )
    {
    	Rubina r = new Rubina(26,"B.E","UTS");
    }

}
package strings;
class Account
	{
		private String name;
		private String phno;
		private String email;
		private String pass;
		private Validation val = new Validation();
		
		public Account(String name,String phno,String email,String pass)
		{
			if(val.checkPass(pass)&&val.checkMail(email)&&val.checkNum(phno))
			{
				this.name=name;
				this.phno=phno;
				this.email=email;
				this.pass=pass;
			}
			else
				System.out.println("Enter valid details");
		}
		@Override
		public String toString() {
			return "Account [name=" + getName() + ", phno=" + phno + ", email=" + email + ", pass=" + pass + "]";
		}
		public String getName() {
			return name;
		}	
	}

	class Validation
	{
		public int length(String pass)
		{
			int i=0;
			try
			{
				for(i=0;;i++)
				{
					pass.charAt(i);
				}
			}
			catch(StringIndexOutOfBoundsException e)
			{
				return i;
			}
		}
		public int numLength(long num)
		{
			int cnt=0;
			for(long i=num;i!=0;i/=10)
				cnt++;
			return cnt;
		}
		public boolean checkUppercase(String s)
		{
			for(int i=0;i<length(s);i++)
			{
				if(s.charAt(i)>='A' && s.charAt(i)<='Z')
					return true;
			}
			return false;
		}
		public boolean checkLower(String s)
		{
			for(int i=0;i<length(s);i++)
			{
				if(s.charAt(i)>='a' && s.charAt(i)<='z')
					return true;
			}
			return false;
		}
		public boolean checkSpecial(String s)
		{
			for(int i=0;i<length(s);i++)
			{
				char ch= s.charAt(i);
				if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'))
					return true;
			}
			return false;
		}
		public boolean checkPass(String pass)
		{
			if(pass==null)
				return false;
			else if(length(pass)>=8 && checkSpecial(pass) && checkUppercase(pass) && checkLower(pass))
				return true;
			else
				return false;
		}
		public boolean checkNum(String num)
		{
			if(length(num)==10 && (num.startsWith("9")||num.startsWith("8")||num.startsWith("7")))
				return true;
			if(length(num)==12 && (num.startsWith("919")||num.startsWith("918")||num.startsWith("917")))
				return true;
			else
				return false;
		}
		public boolean checkMail(String email)
		{
			if(email.endsWith("@gmail.com"))
				return true;
			else if(email.endsWith("@yahoo.com"))
				return true;
			else
				return false;
		}
}

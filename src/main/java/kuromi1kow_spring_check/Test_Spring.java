package kuromi1kow_spring_check;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Spring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "aplication.Context.xml"
        );
        TestBean testBean = context.getBean("testBean",TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}

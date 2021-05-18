/* package net.springboot.javaguides;
  
 import static org.junit.Assert.assertEquals;
 
  import static org.mockito.Mockito.when;
  
  import java.util.ArrayList; import java.util.List;
  
  import org.junit.Before; import org.junit.Test; import
  org.junit.runner.RunWith; import org.mockito.InjectMocks; import
  org.mockito.MockitoAnnotations; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.test.context.SpringBootTest; import
  org.springframework.boot.test.mock.mockito.MockBean; import
  org.springframework.test.context.junit4.SpringRunner;
  
  import net.springboot.javaguides.controller.ProductController; import
  net.springboot.javaguides.model.Product; import
  net.springboot.javaguides.repository.ProductRepository; import
  net.springboot.javaguides.service.ProductService;
  
  @RunWith(SpringRunner.class)
 
  @SpringBootTest
  public class ApplicationTests {
  
  @InjectMocks 
  private ProductController productController;
  
  @Autowired 
  private ProductService productService;
  
  @MockBean
  private ProductRepository productRepository;
  
  @Before 
  public void init()
  {
	  MockitoAnnotations.initMocks(this);
	  }
  
  @Test 
  public void main()
  {
	  Application.main(new String[] {});
	  }
  
  @Test
  public void createProductTest() 
  {
	  Product product = new
  Product(1,"prathyu","prathyu@gmail.com","8889997771","AAAAA4444W");
  when(productRepository.save(product)).thenReturn(product);
  assertEquals(product, productService.createProduct(product));
  
}
 }*/
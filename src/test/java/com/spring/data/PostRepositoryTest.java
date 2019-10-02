package com.spring.data;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.data.entities.Currency;
import com.spring.data.entities.Post;
import com.spring.data.entities.id.CurrencyId;
import com.spring.data.repositories.CurrencyRepository;
import com.spring.data.repositories.PostRepository;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
public class PostRepositoryTest {

	@Autowired
	PostRepository repository;

	@Autowired
	CurrencyRepository currencyRepository;

	@Test
	public void test() {
		Post post = new Post();
		post.setPostDate(getPostDate());
		post.setTitle("First Post");

		post.getCommentsBy().add("Jahalam");
		post.getCommentsBy().add("Sahalam");
		post.getCommentsBy().add("Jharna");


		post.getLikeBy().put("Manager", "Kabir");
		post.getLikeBy().put("Chairman", "Khan");
		post.getLikeBy().put("Director", "Johir");

		repository.save(post);

		Post dbpost = repository.findOne(post.getPostId());
		assertNotNull(dbpost);
		System.out.println(dbpost);

		Currency currency =  new Currency();
		currency.setCountryName("BDT");
		currency.setCurrencyName("Taka");
		currency.setSymbol("$");

		currencyRepository.save(currency);

		System.out.println(currencyRepository.findOne(new CurrencyId(currency.getCurrencyName(), currency.getCountryName())).getSymbol());

	}

	private static Date getPostDate() {
		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, 8);
		calendar.set(Calendar.DATE, 30);
		calendar.set(Calendar.HOUR, 23);
		calendar.set(Calendar.MINUTE, 30);

		/*calendar.set(Calendar.YEAR, 2019);
		calendar.set(Calendar.MONTH, 8);
		calendar.set(Calendar.DATE, 30);
		calendar.set(Calendar.HOUR, 23);
		calendar.set(Calendar.MINUTE, 30);*/
		return calendar.getTime();
		//return new Date();
	}

}

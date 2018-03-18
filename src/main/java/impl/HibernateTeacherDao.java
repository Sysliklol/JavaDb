package impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dao.TeachersDao;
import dao.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class HibernateTeacherDao implements TeachersDao{
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession(){
	return sessionFactory.getCurrentSession();
	}
	public void addTeacher(Teacher teacher) {
	currentSession().save(teacher);
	}
	public Teacher getTeacherById(int id) {
	return (Teacher) currentSession().get(Teacher.class, id);
	}
	public void saveTacher(Teacher teacher) {
	currentSession().update(teacher);
	}

	public List<String> findPhones(){
		Query query = em.createNamedQuery("findPhones");
		return query.getResultList();
	}
}

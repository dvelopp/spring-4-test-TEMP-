package spring4Template.domain.repositories;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring4Template.domain.HibernateIntegrationTest;
import spring4Template.domain.entities.UserAuthority;

import static org.assertj.core.api.Assertions.assertThat;
import static spring4Template.domain.entities.UserAuthorityFixture.createDefaultUserAuthority;

public class UserAuthorityRepositoryTest extends HibernateIntegrationTest<UserAuthority> {

    @Autowired private UserAuthorityCustomRepositoryImpl userAuthorityRepository;

    @Test
    public void save_ValidEntity_EntityWasSaved() {
        UserAuthority expectedUserAuthority = createDefaultUserAuthority();

        userAuthorityRepository.save(expectedUserAuthority);

        UserAuthority actualUserAuthority = getById(expectedUserAuthority.getId());
        assertThat(actualUserAuthority).isEqualTo(expectedUserAuthority);
    }

    @Override
    protected Class<UserAuthority> getEntityClass(){
        return UserAuthority.class;
    }


}
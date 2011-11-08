package org.neo4j.cineasts.service;

import org.neo4j.cineasts.domain.Movie;
import org.neo4j.cineasts.domain.Rating;
import org.neo4j.cineasts.domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mh
 * @since 08.11.11
 */
public interface CineastsUserDetailsService extends UserDetailsService {
    @Override
    UserDetails loadUserByUsername(String login) throws UsernameNotFoundException, DataAccessException;

    User findUser(String login);

    User getUserFromSession();

    @Transactional
    Rating rate(Movie movie, User user, int stars, String comment);

    @Transactional
    User register(String login, String name, String password);

    @Transactional
    void addFriend(String login);
}
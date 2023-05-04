package services.impl;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.UserRepository;
import services.UserService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service("userDetailsService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;
    @Override
    public List<User> listAll() {
        return userRepository.listAll();
    }

    @Override
    public void add(User user) {
        String pass = user.getPassword();
        user.setPassword(passwordEncoder.encode(pass));
        userRepository.add(user);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public User getUserByUserName(String name) {
        return userRepository.getUserByUserName(name);
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.getUserByUserName(s);
        if (user == null) {
            throw new UsernameNotFoundException("Not found");
        }
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole()));
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }
}

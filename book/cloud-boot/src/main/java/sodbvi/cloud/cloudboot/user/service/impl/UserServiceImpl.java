package sodbvi.cloud.cloudboot.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sodbvi.cloud.cloudboot.user.dto.UserDto;
import sodbvi.cloud.cloudboot.user.entity.User;
import sodbvi.cloud.cloudboot.user.repository.UserRepository;
import sodbvi.cloud.cloudboot.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    protected UserRepository userRepository;

    @Override
    public Page<User> getPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User load(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    @Transactional
    public User save(UserDto userDto) {
        User user = this.userRepository.findOne(userDto.getId());
        if (null == user) {
            user = new User();
        }
        user.setNickname(userDto.getNickname());
        user.setAvatar(userDto.getAvatar());
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.delete(id);
    }
}

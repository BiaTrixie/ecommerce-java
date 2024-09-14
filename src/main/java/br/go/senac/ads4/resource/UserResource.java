package br.go.senac.ads4.resource;

import br.go.senac.ads4.dto.UserDto;
import br.go.senac.ads4.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/users" )
public class UserResource implements IResource<UserDto, Integer> {

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public UserDto create(@RequestBody UserDto entity) {
        log.info("UserResource::iniciado");
        log.debug("Valores: {}", entity);
        return null;
    }

    @Override
    @GetMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public UserDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<UserDto> get() {
        return null;
    }

    @Override
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public UserDto update(@PathVariable Integer id, @RequestBody UserDto entity) {
        return null;
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
    }

}
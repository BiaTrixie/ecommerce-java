package br.go.senac.ads4.resource;

import br.go.senac.ads4.dto.OrderDto;
import br.go.senac.ads4.dto.UserDto;
import br.go.senac.ads4.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/orders" )
public class OrderResource implements IResource<OrderDto, Integer> {

    @Override
    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public OrderDto create(@RequestBody OrderDto entity) {
        return null;
    }

    @Override
    @GetMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public OrderDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<OrderDto> get() {
        return null;
    }

    @Override
    @PutMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public OrderDto update(@PathVariable Integer id,@RequestBody OrderDto entity) {
        return null;
    }

    @Override
    @DeleteMapping(
            value="/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}

package org.openapitools.api;

import org.openapitools.model.Response;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-25T03:47:37.349341107Z[Etc/UTC]", comments = "Generator version: 7.13.0")
@Controller
@RequestMapping("${openapi.rootService.base-path:}")
public class GetApiController implements GetApi {

    private final GetApiDelegate delegate;

    public GetApiController(@Autowired(required = false) GetApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new GetApiDelegate() {});
    }

    @Override
    public GetApiDelegate getDelegate() {
        return delegate;
    }

}

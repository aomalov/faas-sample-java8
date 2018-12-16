package com.openfaas.function;

import com.openfaas.model.IHandler;
import com.openfaas.model.IResponse;
import com.openfaas.model.IRequest;
import com.openfaas.model.Response;

public class Handler implements IHandler {

    public IResponse Handle(IRequest req) {
        Response res = new Response();

        if (req.getBody() != null)
            res.setBody(req.getBody());
        else
            res.setBody("Hello, world!");

        return res;
    }
}

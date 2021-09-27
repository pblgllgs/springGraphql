package com.pblgllgs.springgraphql.resolver;

import com.pblgllgs.springgraphql.domain.bank.BankAccount;
import com.pblgllgs.springgraphql.domain.bank.Client;
import com.pblgllgs.springgraphql.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id){
        log.info("Retrieving bank account id: {}",id);

        /*var clientA = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Pablo")
                .lastName("Gallegos")
                .build();

        var clientB = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Rafael")
                .lastName("Gallegos")
                .build();

        clientA.setClient(clientB);
        clientB.setClient(clientA);*/

        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .client(Client.builder()
                        .id(UUID.randomUUID())
                        .firstName("Pablo")
                        .lastName("Gallegos")
                        .build())
                .build();
    }


}

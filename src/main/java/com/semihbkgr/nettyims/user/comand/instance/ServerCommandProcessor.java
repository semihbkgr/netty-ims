package com.semihbkgr.nettyims.user.comand.instance;

import com.semihbkgr.nettyims.message.MessageHandler;
import com.semihbkgr.nettyims.user.comand.MessagePublishCommandProcessor;
import lombok.NonNull;

import javax.inject.Inject;
import javax.inject.Named;

public class ServerCommandProcessor extends MessagePublishCommandProcessor {

    @Inject
    public ServerCommandProcessor(@Named("serverCommandPrefix") @NonNull String commandPrefix,
                                  @Named("serverCommandSender") @NonNull String sender,
                                  @NonNull MessageHandler messageHandler) {
        super(commandPrefix, sender, messageHandler);
    }

    @Override
    protected String publish(@NonNull String command) {
        return "server";
    }

}

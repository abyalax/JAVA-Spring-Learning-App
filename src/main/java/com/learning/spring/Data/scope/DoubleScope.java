package com.learning.spring.Data.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.lang.Nullable;

public class DoubleScope implements Scope {

    private final List<Object> objects = new ArrayList<>(2);
    private Long counter = 0L;

    @SuppressWarnings("null")
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;
        if (objects.size() == 2) {
            int index = (int) (counter % 2);
            return objects.get(index);
        } else {
            Object object = objectFactory.getObject();
            objects.add(object);
        }
        return null;
    }

    @Override
    @Nullable
    public Object remove(@SuppressWarnings("null") String name) {
        if (!objects.isEmpty()) {
            return objects.remove(0);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(@SuppressWarnings("null") String name, @SuppressWarnings("null") Runnable callback) {
        throw new UnsupportedOperationException("Unimplemented method 'registerDestructionCallback'");
    }

    @Override
    public Object resolveContextualObject(@SuppressWarnings("null") String key) {
        throw new UnsupportedOperationException("Unimplemented method 'resolveContextualObject'");
    }

    @Override
    public String getConversationId() {
        throw new UnsupportedOperationException("Unimplemented method 'getConversationId'");
    }

}

package br.com.gjayme.curse.teacher.command.api;

import java.util.UUID;

public class ValueObjects {

    static class TeacherId {
        private final UUID identifier;

        public TeacherId(UUID identifier) {
            this.identifier = identifier;
        }

        @Override
        public String toString() {
            return identifier.toString();
        }
    }
}

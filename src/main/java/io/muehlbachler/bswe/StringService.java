package io.muehlbachler.bswe;

import org.springframework.stereotype.Service;

// FIXME: add javadoc
@Service
public class StringService {
    // FIXME: add javadoc
    public String toUpperCase(final String string) {
        if (string == null) {
            return null; // Rückgabe von null, wenn der Eingabestring null ist.
        }
        return string.toUpperCase();
    }
}

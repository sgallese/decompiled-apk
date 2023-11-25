package ga;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.m;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: Streams.java */
/* loaded from: classes3.dex */
public final class k {
    public static com.google.gson.l a(ja.a aVar) throws JsonParseException {
        boolean z10;
        try {
            try {
                aVar.l0();
                z10 = false;
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return TypeAdapters.X.read(aVar);
            } catch (EOFException e11) {
                e = e11;
                if (z10) {
                    return m.f12237f;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e12) {
            throw new JsonSyntaxException(e12);
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        } catch (NumberFormatException e14) {
            throw new JsonSyntaxException(e14);
        }
    }

    public static void b(com.google.gson.l lVar, ja.c cVar) throws IOException {
        TypeAdapters.X.write(cVar, lVar);
    }
}

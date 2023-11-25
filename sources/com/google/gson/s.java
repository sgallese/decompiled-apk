package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: TypeAdapter.java */
/* loaded from: classes3.dex */
public abstract class s<T> {

    /* compiled from: TypeAdapter.java */
    /* loaded from: classes3.dex */
    class a extends s<T> {
        a() {
        }

        @Override // com.google.gson.s
        public T read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return (T) s.this.read(aVar);
        }

        @Override // com.google.gson.s
        public void write(ja.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.L();
            } else {
                s.this.write(cVar, t10);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new ja.a(reader));
    }

    public final T fromJsonTree(l lVar) {
        try {
            return read(new com.google.gson.internal.bind.a(lVar));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final s<T> nullSafe() {
        return new a();
    }

    public abstract T read(ja.a aVar) throws IOException;

    public final void toJson(Writer writer, T t10) throws IOException {
        write(new ja.c(writer), t10);
    }

    public final l toJsonTree(T t10) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, t10);
            return bVar.A0();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public abstract void write(ja.c cVar, T t10) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}

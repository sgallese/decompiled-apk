package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes3.dex */
public abstract class l {
    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public i h() {
        if (m()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n i() {
        if (o()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o j() {
        if (p()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean m() {
        return this instanceof i;
    }

    public boolean n() {
        return this instanceof m;
    }

    public boolean o() {
        return this instanceof n;
    }

    public boolean p() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ja.c cVar = new ja.c(stringWriter);
            cVar.f0(true);
            ga.k.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}

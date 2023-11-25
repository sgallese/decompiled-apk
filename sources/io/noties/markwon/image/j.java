package io.noties.markwon.image;

import java.io.InputStream;

/* compiled from: ImageItem.java */
/* loaded from: classes4.dex */
public abstract class j {

    /* compiled from: ImageItem.java */
    /* loaded from: classes4.dex */
    public static class b extends j {

        /* renamed from: a  reason: collision with root package name */
        private final String f17219a;

        /* renamed from: b  reason: collision with root package name */
        private final InputStream f17220b;

        @Override // io.noties.markwon.image.j
        public c b() {
            throw new IllegalStateException();
        }

        @Override // io.noties.markwon.image.j
        public boolean c() {
            return true;
        }

        public String e() {
            return this.f17219a;
        }

        public InputStream f() {
            return this.f17220b;
        }

        private b(String str, InputStream inputStream) {
            super();
            this.f17219a = str;
            this.f17220b = inputStream;
        }

        @Override // io.noties.markwon.image.j
        public b a() {
            return this;
        }
    }

    /* compiled from: ImageItem.java */
    /* loaded from: classes4.dex */
    public static class c extends j {
    }

    public static j d(String str, InputStream inputStream) {
        return new b(str, inputStream);
    }

    public abstract b a();

    public abstract c b();

    public abstract boolean c();

    private j() {
    }
}

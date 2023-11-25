package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0255a;
import com.google.protobuf.h;
import com.google.protobuf.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes3.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0255a<MessageType, BuilderType>> implements q0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0255a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0255a<MessageType, BuilderType>> implements q0.a {
        protected static <T> void p(Iterable<T> iterable, List<? super T> list) {
            z.a(iterable);
            if (iterable instanceof f0) {
                List<?> T = ((f0) iterable).T();
                f0 f0Var = (f0) list;
                int size = list.size();
                for (Object obj : T) {
                    if (obj == null) {
                        String str = "Element at index " + (f0Var.size() - size) + " is null.";
                        for (int size2 = f0Var.size() - 1; size2 >= size; size2--) {
                            f0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof h) {
                        f0Var.d((h) obj);
                    } else {
                        f0Var.add((String) obj);
                    }
                }
            } else if (iterable instanceof z0) {
                list.addAll((Collection) iterable);
            } else {
                q(iterable, list);
            }
        }

        private static <T> void q(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static UninitializedMessageException t(q0 q0Var) {
            return new UninitializedMessageException(q0Var);
        }

        protected abstract BuilderType r(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.q0.a
        /* renamed from: s  reason: merged with bridge method [inline-methods] */
        public BuilderType m(q0 q0Var) {
            if (c().getClass().isInstance(q0Var)) {
                return (BuilderType) r((a) q0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void p(Iterable<T> iterable, List<? super T> list) {
        AbstractC0255a.p(iterable, list);
    }

    private String s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.q0
    public h h() {
        try {
            h.C0256h n10 = h.n(k());
            e(n10.b());
            return n10.a();
        } catch (IOException e10) {
            throw new RuntimeException(s("ByteString"), e10);
        }
    }

    int q() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r(f1 f1Var) {
        int q10 = q();
        if (q10 == -1) {
            int g10 = f1Var.g(this);
            u(g10);
            return g10;
        }
        return q10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UninitializedMessageException t() {
        return new UninitializedMessageException(this);
    }

    void u(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] v() {
        try {
            byte[] bArr = new byte[k()];
            CodedOutputStream d02 = CodedOutputStream.d0(bArr);
            e(d02);
            d02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(s("byte array"), e10);
        }
    }
}

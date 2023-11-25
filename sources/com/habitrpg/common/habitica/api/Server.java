package com.habitrpg.common.habitica.api;

import qc.q;
import yc.v;

/* compiled from: Server.kt */
/* loaded from: classes4.dex */
public final class Server {
    private String addr;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Server(String str) {
        this(str, true);
        q.i(str, "addr");
    }

    public String toString() {
        return this.addr;
    }

    private Server(String str, boolean z10) {
        boolean q10;
        boolean q11;
        boolean q12;
        if (z10) {
            q10 = v.q(str, "/api/v4", false, 2, null);
            if (!q10) {
                q11 = v.q(str, "/api/v4/", false, 2, null);
                if (!q11) {
                    q12 = v.q(str, "/", false, 2, null);
                    if (q12) {
                        this.addr = str + "api/v4/";
                        return;
                    }
                    this.addr = str + "/api/v4/";
                    return;
                }
            }
            this.addr = str;
            return;
        }
        this.addr = str;
    }

    public Server(Server server) {
        q.i(server, "server");
        this.addr = server.toString();
    }
}

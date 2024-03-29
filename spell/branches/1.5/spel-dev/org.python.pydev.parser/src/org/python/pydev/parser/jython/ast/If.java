// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public class If extends stmtType {
    public exprType test;
    public stmtType[] body;
    public stmtType[] orelse;

    public If(exprType test, stmtType[] body, stmtType[] orelse) {
        this.test = test;
        this.body = body;
        this.orelse = orelse;
    }

    public If(exprType test, stmtType[] body, stmtType[] orelse, SimpleNode
    parent) {
        this(test, body, orelse);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("If[");
        sb.append("test=");
        sb.append(dumpThis(this.test));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append(", ");
        sb.append("orelse=");
        sb.append(dumpThis(this.orelse));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitIf(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (test != null)
            test.accept(visitor);
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null)
                    body[i].accept(visitor);
            }
        }
        if (orelse != null) {
            for (int i = 0; i < orelse.length; i++) {
                if (orelse[i] != null)
                    orelse[i].accept(visitor);
            }
        }
    }

}

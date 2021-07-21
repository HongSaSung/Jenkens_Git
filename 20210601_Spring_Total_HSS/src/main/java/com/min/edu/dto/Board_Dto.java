package com.min.edu.dto;

public class Board_Dto {
	
	private int seq;
	private String id;
	private String title;
	private String content;
	private int step;
	private int depth;
	private int refer;
	private int readcount;
	private String delflag;
	private String regdate;
	
	public Board_Dto() {
		// TODO Auto-generated constructor stub
	}

	public Board_Dto(int seq, String id, String title, String content, int step, int depth, int refer, int readcount,
			String delflag, String regdate) {
		super();
		this.seq = seq;
		this.id = id;
		this.title = title;
		this.content = content;
		this.step = step;
		this.depth = depth;
		this.refer = refer;
		this.readcount = readcount;
		this.delflag = delflag;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Board_Dto [seq=" + seq + ", id=" + id + ", title=" + title + ", content=" + content + ", step=" + step
				+ ", depth=" + depth + ", refer=" + refer + ", readcount=" + readcount + ", delflag=" + delflag
				+ ", regdate=" + regdate + "]";
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getRefer() {
		return refer;
	}

	public void setRefer(int refer) {
		this.refer = refer;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
}

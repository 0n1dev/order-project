package com.fastcampus.order.domain;

import java.time.ZonedDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity {

	// @CreatedDate ZonedDateTime 지원 안함
	@CreationTimestamp
	private ZonedDateTime createdAt;

	// @LastModifiedDate ZonedDateTime 지원 안함
	@UpdateTimestamp
	private ZonedDateTime updatedAt;

}
